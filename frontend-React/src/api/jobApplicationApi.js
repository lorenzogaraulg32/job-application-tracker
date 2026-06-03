const BASE_URL = import.meta.env.VITE_API_BASE_URL;
const JOB_APPLICATION_URL = BASE_URL + "/api/job_applications";


export async function getAllApplications() {
    const res = await fetch(JOB_APPLICATION_URL);

    if (!res.ok) {
        throw new Error("Errore durante il recupero delle candidature, status: " + res.status);
    }
    return await res.json();
}