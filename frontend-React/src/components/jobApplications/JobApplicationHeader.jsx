import "../../styles/jobApplications/jobApplicationHeader.css";


export function JobApplicationHeader() {
    return (
        <div className={"applicationHeader"}>
            <p>Azienda</p>
            <a>Link alla candidatura</a>
            <p>Ruolo</p>
            <p>Sede di lavoro</p>
            <p>Stato candidatura</p>
            <p>Note</p>
            <p>Data di candidatura</p>
            <p>Data <br/> follow-Up</p>
            <p>Ultimo aggiornamento</p>
        </div>
    )
}