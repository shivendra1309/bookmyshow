package com.thetechniciansteam.bookmyshow.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.actuate.endpoint.Show;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String title;
    private String description;
    private int durationInMins;
    private String language;
    private long releaseDate;
    private String genre;
    private TheatreAdministrator movieAddedBy;
    private List<Show> shows = new ArrayList<>();

}
