import {StrictMode, useState} from 'react'
import {createRoot} from 'react-dom/client'
import {Button} from "@mui/material";
import {getAllApplications} from "./api/jobApplicationApi.js";

function LoadAllApplications() {
    const [applications, setApplications] = useState([]);
    const [error, setError] = useState("");
    const [loading, setLoading] = useState(false);

    async function handleLoadApplications() {
        try {
            setLoading(true);
            setError("");

            const data = await getAllApplications();

            setApplications(data);
        } catch (err) {
            setError(err.message)
        } finally {
            setLoading(false);
        }
    }

    return (
        <div>
            <h1>Application Job Tracker</h1>

            <Button variant="contained" color="secondary" onClick={handleLoadApplications}>
                Carica candidature
            </Button>


            {loading && <p>Caricamento...</p>}

            {error && <p style={{color: "red"}}>{error}</p>}

            <pre>
                {JSON.stringify(applications, null, 2)}
            </pre>
        </div>
    )

}

createRoot(document.getElementById('root')).render(
    <StrictMode>
        <LoadAllApplications/>
    </StrictMode>,
)
