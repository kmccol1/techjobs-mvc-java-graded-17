package org.launchcode.techjobsmvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController
{
    private static HashMap<String, String> actionChoices= new HashMap<>();
    private static HashMap<String, String> columnChoices = new HashMap<>();

    public TechJobsController()
    {
        actionChoices.put("search", "search");
        actionChoices.put("list", "list");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
    }

    @ModelAttribute("actionChoices")
    public static HashMap<String, String> getActionChoices()
    {
        return actionChoices;
    }
}
