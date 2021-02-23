package io.hashimati.requestservice.domains;

import java.util.Date;
import io.hashimati.requestservice.domains.enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Request {
    private String id, type, title, detail, requesterName, city;
    // 3 status, INITIATED, DONE, CANCELED
    private RequestStatus status = RequestStatus.INITIATED;
    private Date date , lastUpdate = date = new Date();

    // used by service provider, uses MongoDB Geo special features
    private Location location; 
    
}
