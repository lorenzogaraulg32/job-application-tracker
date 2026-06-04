import {APP_TEXTS} from "../../constants/texts.js";
import "../../styles/layout/header.css";

import appIcon from "../../assets/icon.png"

export function Header() {
    return (
        <header className="app-header">
            <img
                src={appIcon}
                alt="App Icon"
                className="app-header-icon"/>

            <h1 className="app-header-title">
                {APP_TEXTS.app_title}
            </h1>

        </header>
    )
}