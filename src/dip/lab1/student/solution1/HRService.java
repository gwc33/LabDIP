package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author your name goes here
 */
public class HRService {
    
    
    
    HRService(Employee e){
         System.out.println("The employees annual wages is "  + e.getAnnualWages());
    }
    
    
}
