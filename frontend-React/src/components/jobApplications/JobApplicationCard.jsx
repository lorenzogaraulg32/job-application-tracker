import "../../styles/jobApplications/jobApplicationList.css";


export function JobApplicationCard({application}) {

    const id = application.id;
    const applicationDate = application.applicationDate;
    const url = application.applicationUrl;
    const company = application.company;
    const createdAt = application.createdAt;
    const followUp = application.followUp;
    const location = application.location;
    const notes = application.notes;
    const role = application.role;
    const status = application.status;
    const updatedAt = application.updatedAt;


    const statusClassMap = {
        CANDIDATURA_INVIATA: "statusBadge statusBadge--sent",
        COLLOQUIO: "statusBadge statusBadge--interview",
        RIFIUTATO: "statusBadge statusBadge--rejected",
        OFFERTA: "statusBadge statusBadge--offer"
    };

    const statusClass = statusClassMap[status] || "statusBadge";

    return (
        <div className={"applicationCard"}>
            <p>{company}</p>
            <a href={url}>Apri candidatura →</a>
            <p className="applicationCard-role">
                <span>
                    {role}
                </span>
            </p>
            <p>{location}</p>
            <p className="applicationCard-status">
                <span className={statusClass}>
                    {formatStatus(status)}
                </span>
            </p>
            <p className="applicationCard-notes">
                <span>{notes}</span>
            </p>
            <p>{formatDate(applicationDate)}</p>
            <p>{formatDate(followUp)}</p>
            <p>{formatDate(updatedAt)}</p>
        </div>
    )

}

function formatDate(date) {
    if (date === null) return " ";
    const parts = date.split("T");

    let days = parts[0].split("-")
    let year = days[0]
    let month = days[1]
    let day = days[2]

    //let hour = parts[1].slice(0, 5)

    return day + "/" + month + "/" + year
}

function formatStatus(status) {
    if (status != null) {

        let s = status.replace("_", " ").toLowerCase();
        return s.charAt(0).toUpperCase() + s.slice(1);
    } else {
        return " "
    }
}

