package ulearn.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController {
    // main tabs
    public TabPane mainTabs;
    public Tab chatTab = new Tab(), classTab = new Tab(), calTab = new Tab(), storageTab = new Tab(), settingsTab = new Tab();

    // calendar
    public WebView gCalWV = new WebView();
    public WebView driveWView = new WebView();

    @FXML
    void tabEvents(Event ev) {
        if (calTab.isSelected()) {
            gCalendar();
        } else if (storageTab.isSelected()) {
            gDrive();
        }
    }

    void gCalendar() {
        WebEngine wEngine = gCalWV.getEngine();
        wEngine.load("https://calendar.google.com");
        gCalWV.setZoom(0.8);

    }

    void gDrive() {
        WebEngine we = driveWView.getEngine();
        we.load("https://drive.google.com/drive");
        driveWView.setZoom(0.8);
    }

}
