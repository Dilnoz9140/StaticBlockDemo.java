package OfficeHours.Practice_03_03_2021;

       /** create A main method

        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers,
        allows pets or not, has A pool, length of lease, total number of residents in building,
        phone number of owner, is near A gas station, number of floors, has A basement,
        has available units for rent, has air conditioning, number of parking spaces,
        has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

        - monthly rent after 3 years (discount 10% off original rent)
        - monthly rent after 6 years (discount 20% off original rent)
        - Average number of residents per unit (total residents / number of units)
        - Average number of parking spots per unit ( parking spots / units)
        - Average number of units per floor ( units / number of floors)*/

      public class Apartment {
           public static void main(String[] args) {
               String address="400 Centerview Dr,Brentwood Tn 37027";
               String nameOfOwner="Tapestry at Brentwood", phoneNumberOfOwner="(615)717-7777",numberOfReviewStars="5 of 5";
               byte numberOfUnits=77,lengthOfLease=12, numberOfFloors=7;
               double averageSizeUnit=1500, monthlyRent=1747.7;
               short numberOfWashersDriers = 154 ,numberOfResidents=327, numberOfParking=227;
               boolean doesAllowsPet=true,isTherePool=true, isNearGasStation=true,hasBasement=false,hasAvailableUnits=true;
               boolean hasAirCondition=true,hasWheelChairAccess=true;

               double monthlyRentAfter3Years= monthlyRent-(monthlyRent*0.1);
               double monthlyRentAfter6Years= monthlyRent-(monthlyRent*0.2);
               int numberOfResidentPerUnit= numberOfResidents/numberOfUnits ;
               int numberOfParkingPerUnit= numberOfParking/numberOfUnits;
               int numberOfUnitsPerFloor= numberOfUnits/numberOfFloors;

               System.out.println("Welcome to our "+ nameOfOwner);
               System.out.println("We are located on "+ address);
               System.out.println("Our units are "+ averageSizeUnit);
               System.out.println();
               System.out.println();
               System.out.println();
               System.out.println();









           }

}
