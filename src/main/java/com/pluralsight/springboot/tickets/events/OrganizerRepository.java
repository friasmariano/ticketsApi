
package com.pluralsight.springboot.tickets.events;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers = List.of(
      new Organizer(101, "Globomantics", "Globomantics Technology Corporation"),
      new Organizer(102, "Carved Rock", "Carved Rock Sports Equipment")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}
