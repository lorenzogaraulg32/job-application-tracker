import "../../styles/layout/sidebar.css";
import {useState} from "react";


export function Sidebar() {
    const [isOpen, setIsOpen] = useState(false);
    const [activeButton, setActiveButton] = useState("candidature")

    function getSidebarClass() {
        if (isOpen) {
            return "sidebar sidebar--open";
        } else {
            return "sidebar";
        }
    }

    function getButtonClass(buttonName) {
        if (buttonName === activeButton) {
            return "sidebarButton sidebarButton--active"
        } else {
            return "sidebarButton";
        }
    }

    return (
        <aside className={getSidebarClass()} aria-label="Apri menù">
            <button className="sidebar-menu-button" aria-label="Apri menu" onClick={() => setIsOpen(!isOpen)}>
                <span></span>
                <span></span>
                <span></span>
            </button>
            <div className={"sidebarButtons"}>
                <button
                    className={getButtonClass("profilo")}
                    onClick={() => {
                        setActiveButton("profilo")
                    }}>Profilo
                </button>
                <button
                    className={getButtonClass("candidature")}
                    onClick={() => {
                        setActiveButton("candidature")
                    }}>Candidature
                </button>
                <button
                    className={getButtonClass("about")}
                    onClick={() => {
                        setActiveButton("about")
                    }}>About Us
                </button>
            </div>
        </aside>
    )
}