import java.util.Scanner;
class FlightTicket {
    int r=5,c=16;
    String seats[][],pass_name;
    int row_pass,col_pass;
    Scanner sc=new Scanner(System.in);
    FlightTicket(int r,int c)
    {
        seats=new String[5][16];
    }

    void display_seats()
    {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(seats[i][j] + " ");
                
            }
            System.out.println();
            
        }
        System.out.println();
    }
    
    void Ticket_reservation(String passanger_name,int row_passanger,int col_passanger)
    {
        this.pass_name=passanger_name;
        this.row_pass=row_passanger;
        this.col_pass=col_passanger;
        
        if(seats[row_passanger][col_passanger]==null)
        {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    seats[row_passanger][col_passanger]=passanger_name;
                    
                }
                
            }
            System.out.println("Your ticket is sucessfully booked");
        }
        else
        {
            System.out.println("This seat was already booked by " + seats[row_pass][col_pass]);
        }
        
        
        System.out.println();

    }

    void Ticket_cancel(String passanger_cancel)
    {
        this.pass_name=passanger_cancel;
        
      
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                try {
                    if(seats[i][j].equals(passanger_cancel))
                    {
                        seats[i][j]=null;
                        System.out.println("Your ticket is sucessfully cancled");
                    }
                } catch (Exception e) {
                    //Just exception
                }
            }
        }
    }
    
    
}
