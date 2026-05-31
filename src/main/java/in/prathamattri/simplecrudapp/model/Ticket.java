package in.prathamattri.simplecrudapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Ticket{
    private String movieName;
    private String hallName;
    private float price;
}
