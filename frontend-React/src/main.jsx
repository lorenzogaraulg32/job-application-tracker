import {StrictMode} from 'react'
import {createRoot} from 'react-dom/client'
import {Header} from "./components/layout/Header.jsx";
import "./styles/index.css"
import "./styles/theme.css";
import {JobApplicationList} from "./components/jobApplications/JobApplicationList.jsx";


createRoot(document.getElementById('root')).render(
    <StrictMode>
        <Header/>
        <JobApplicationList/>
    </StrictMode>
)
