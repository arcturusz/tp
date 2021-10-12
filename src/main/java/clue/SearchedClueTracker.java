package clue;

import ui.Ui;
import suspect.SuspectList;

import java.util.ArrayList;

public class SearchedClueTracker {
    private Ui ui;
    private SuspectList suspects;

    public SearchedClueTracker(Ui ui, SuspectList suspects) {
        this.ui = ui;
        this.suspects = suspects;
    }
    
    public void viewSearcherdCLues(String name) {
        ArrayList<Clue> availableClues = suspects.getSuspectAvailableClues(name);
        ui.printListOfClues(availableClues);
    }
}
