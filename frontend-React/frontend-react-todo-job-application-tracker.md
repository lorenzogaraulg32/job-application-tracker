# Frontend React TODO — Job Application Tracker

## Setup
- [ ] Installare Node.js LTS.
- [ ] Verificare `node -v` e `npm -v`.
- [ ] Creare progetto React con Vite.
- [ ] Avviare frontend su `localhost:5173`.
- [ ] Pulire struttura iniziale.
- [ ] Installare Axios.
- [ ] Installare libreria UI scelta, ad esempio Material UI.

## Struttura progetto
- [ ] Creare cartelle `api`, `components`, `pages`, `styles`.
- [ ] Creare `jobApplicationApi.js`.
- [ ] Definire base URL del backend.
- [ ] Creare pagina principale `JobApplicationsPage`.

## GET all

Endpoint backend:

```http
GET /api/job_applications
```

- [ ] Creare funzione `getAllJobApplications`.
- [ ] Caricare candidature all’avvio pagina.
- [ ] Salvare dati nello state.
- [ ] Mostrare candidature in tabella/card.
- [ ] Gestire loading.
- [ ] Gestire lista vuota.
- [ ] Gestire errori.

## GET by id

Endpoint backend:

```http
GET /api/job_applications/{id}
```

- [ ] Creare funzione `getJobApplicationById`.
- [ ] Creare vista dettaglio candidatura.
- [ ] Gestire errore 404.

## POST create

Endpoint backend:

```http
POST /api/job_applications
```

- [ ] Creare funzione `createJobApplication`.
- [ ] Creare form nuova candidatura.
- [ ] Inserire campi:
  - [ ] company
  - [ ] role
  - [ ] applicationUrl
  - [ ] location
  - [ ] notes
  - [ ] applicationDate
- [ ] Gestire submit.
- [ ] Inviare dati al backend.
- [ ] Gestire errori di validazione 400.
- [ ] Mostrare errori campo per campo.
- [ ] Aggiornare lista dopo creazione.
- [ ] Mostrare messaggio di successo.

## PUT update completo

Endpoint backend:

```http
PUT /api/job_applications/{id}
```

- [ ] Creare funzione `updateJobApplication`.
- [ ] Creare form update completo.
- [ ] Popolare form con dati esistenti.
- [ ] Inviare body completo.
- [ ] Gestire errori 400 e 404.
- [ ] Aggiornare lista dopo modifica.
- [ ] Mostrare messaggio di successo.

Nota:

```text
PUT = aggiornamento completo della risorsa
```

## PATCH update parziale

Endpoint backend:

```http
PATCH /api/job_applications/{id}
```

- [ ] Creare funzione `patchJobApplication`.
- [ ] Creare azioni rapide per:
  - [ ] status
  - [ ] notes
  - [ ] followUpDate
- [ ] Inviare solo i campi modificati.
- [ ] Gestire validazione `followUpDate`.
- [ ] Aggiornare lista dopo patch.
- [ ] Mostrare messaggio di successo.

Nota:

```text
PATCH = aggiornamento parziale della risorsa
```

Nel backend attuale la PATCH è permissiva:

```text
campo null → ignorato
campo blank → ignorato
campo valorizzato → aggiornato
```

## DELETE

Endpoint backend:

```http
DELETE /api/job_applications/{id}
```

- [ ] Creare funzione `deleteJobApplication`.
- [ ] Aggiungere pulsante elimina.
- [ ] Chiedere conferma prima di eliminare.
- [ ] Eliminare candidatura.
- [ ] Aggiornare lista.
- [ ] Gestire errore 404.
- [ ] Mostrare messaggio di successo.

## Error handling frontend
- [ ] Gestire errori 400.
- [ ] Gestire errori 404.
- [ ] Gestire errori 500.
- [ ] Gestire backend non raggiungibile.
- [ ] Mostrare messaggi user-friendly.
- [ ] Mostrare errori di validazione sotto i campi.
- [ ] Gestire loading durante le chiamate API.
- [ ] Gestire messaggi di successo.

## UI
- [ ] Creare layout principale.
- [ ] Creare header/navbar.
- [ ] Creare tabella candidature.
- [ ] Creare form ordinati.
- [ ] Creare badge per status.
- [ ] Creare modal/dialog per modifica.
- [ ] Aggiungere messaggi successo/errore.
- [ ] Rendere UI responsive.

## Gestione status candidature
- [ ] Replicare temporaneamente gli enum del backend nel frontend.
- [ ] Creare select per lo status.
- [ ] Mostrare status in modo leggibile.
- [ ] Convertire valori tecnici in label leggibili.

Esempio:

```text
CANDIDATURA_INVIATA → Candidatura inviata
```

- [ ] Usare PATCH per cambio rapido status.
- [ ] Gestire valori non validi.

## Filtri e ricerca
- [ ] Aggiungere filtro per company.
- [ ] Aggiungere filtro per role.
- [ ] Aggiungere filtro per status.
- [ ] Aggiungere filtro per location.
- [ ] Aggiungere ordinamento per data candidatura.
- [ ] Evidenziare follow-up imminenti.

## Rifinitura portfolio
- [ ] Scrivere README frontend.
- [ ] Spiegare come avviare il progetto.
- [ ] Indicare dipendenze:
  - [ ] React
  - [ ] Vite
  - [ ] Axios
  - [ ] Material UI, se usato
- [ ] Inserire screenshot della dashboard.
- [ ] Collegare README frontend al README backend.
- [ ] Aggiornare README backend indicando che esiste anche il frontend.
- [ ] Fare commit.
- [ ] Push su GitHub.

## Obiettivo finale

Realizzare un'app full stack composta da:

```text
React frontend
        ↓
Spring Boot REST API
        ↓
MySQL database
```

Funzionalità finali minime:

- [ ] Visualizzare tutte le candidature.
- [ ] Visualizzare dettaglio candidatura.
- [ ] Creare nuova candidatura.
- [ ] Modificare completamente una candidatura con PUT.
- [ ] Modificare parzialmente una candidatura con PATCH.
- [ ] Eliminare candidatura.
- [ ] Gestire errori backend.
- [ ] Mostrare una UI pulita e responsive.
