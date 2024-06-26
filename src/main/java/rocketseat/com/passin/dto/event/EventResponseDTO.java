package rocketseat.com.passin.dto.event;

import lombok.Getter;
import rocketseat.com.passin.domain.event.Event;


@Getter
public class EventResponseDTO {
    EventDetailDTO eventDetail;

    public EventResponseDTO(Event event, Integer numberOfAttendees) {
        this.eventDetail = new EventDetailDTO(event.getId(), event.getTitle(), event.getDetails(), event.getSlug(), event.getMaximumAttendees(), numberOfAttendees);

    }

}
