import {useEffect, useState} from "react";
import {getAllApplications} from "../../api/jobApplicationApi.js";
import {JobApplicationCard} from "./JobApplicationCard.jsx";
import "../../styles/jobApplications/applications.css";

export function JobApplicationList() {

    //definisco gli stati
    const [applications, setApplications] = useState([]);
    const [error, setError] = useState("");
    const [loading, setLoading] = useState(false);

    //useEffect si occupa di caricare i dati e aggiornare gli stati di conseguenza
    useEffect(() => {
        async function loadApplications() {
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

        loadApplications()


    }, []);

    //content definisce il contenuto della pagina, che varia in base agli stati e alle applications recuperate
    let content;

    if (loading) {
        content = <p className={"loading"}>Caricamento...</p>
    } else if (error) {
        content = <p className={"error"}>{error}</p>
    } else if (applications.length === 0) {
        content = <p className={"success"}>Nessuna candidatura</p>
    } else {
        //per ogni elemento di application creo un component funzionale JobApplicationCard
        content = applications.map(application => (
            <JobApplicationCard
                key={application.id}
                application={application}
            />

        ))
        //content = <pre>{JSON.stringify(applications, null, 2)}</pre>
    }


    return (
        <div className={"applicationList"}>
            {content}
        </div>
    )

}
