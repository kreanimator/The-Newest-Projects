public class GearBox {
    /**
 * 0 - neutral
 * - 1 - rear
 * 1 - 6
 */

    private static final int maxGear = 6;
    private static final int minGear = 1;
 private int gear = 0;

 private void shiftUp(){
     gear = gear < maxGear ? gear + 1 : gear ;
 }

 private void shiftDown(){

     gear = gear > minGear ? gear - 1 : gear ;
 }

 private void switchRear(){
     gear = ( gear > 1) ? gear : -1;
 }

 private void switchNeutral(){
     gear = 0;
 }
 private int getCurrentGear (){
     return gear;
 }

 }