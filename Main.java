import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie[] movie = new Movie[5];
        Series[] series = new Series[5];
        
        movie[0] = new Movie("James Wan", "Insidious", Type.HORROR, 1.0, 180);
        movie[1] = new Movie("Michel Levin", "Couples Retreat", Type.COMEDY, 3.5, 150);
        movie[2] = new Movie("Robert Eric", "Blue Crush", Type.COMEDY, 3.4, 120);
        movie[3] = new Movie("Micky Way", "Operation Fortune", Type.ACTION, 9.5, 150);
        movie[4] = new Movie("Ferando Akira", "Wakanda Forever", Type.ACTION, 7.4, 120);

        series[0] = new Series("Julie Elle", "Sweet home", Type.COMEDY, 9.1, 30, 60);
        series[1] = new Series("Peter Ling", "The Crownded Cloun", Type.DRAMA, 6.2, 41, 50);
        series[2] = new Series("Andy Ng", "Super Hero 2021", Type.ACTION, 5.1, 56, 40);
        series[3] = new Series("Lucifer Hany", "Army Of The Dead", Type.DOCUMENTATRY, 3.7, 45, 55);
        series[4] = new Series("Cris Vine", "Resident Evil", Type.HORROR, 2.0, 63, 30);

        //print all Movie/Series info
        System.out.printf("\nShow All Movies:\n");
        for (Movie mov : movie) {
            mov.showMovieInfo();
        }

        System.out.printf("\nShow All Series:\n");
        for (Series ser : series) {
            ser.showSeriesInfo();
        }

        //find by title
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nInput film title to search: ");
        String searchTitle = sc.nextLine();
        sc.close();

        for (Movie mov : movie) {
            if(mov.hasTitleContain(searchTitle)) {
                System.out.print("Search found: ");
                mov.showMovieInfo();
            }
        }

        for (Series ser : series) {
            if(ser.hasTitleContain(searchTitle)) {
                System.out.print("Search found: ");
                ser.showSeriesInfo();
            }
        }

        //find worst rank-> the rank value is "biggest" is worst rank
        System.out.printf("\nShow worst ranking film:\n");

        Object obj = null;
        double worstRank = 0.0;

        for (Movie mov : movie) {
            if (mov.getRank() > worstRank) {
                worstRank = mov.getRank();
                obj = mov;
            }
        }

        for (Series ser : series) {
            if (ser.getRank() > worstRank) {
                worstRank = ser.getRank();
                obj = ser;
            }   
        }

        if (obj instanceof Movie) {
            Movie movTemp = (Movie) obj;
            movTemp.showMovieInfo();
        } else if (obj instanceof Series) {
            Series serTemp = (Series) obj;
            serTemp.showSeriesInfo();
        }

        //find direct of COMEDY's worst rank
        Object objComedy = null;
        double worstComedyRank = 0.0;

        for (Movie mov : movie) {
            if ((mov.getRank() > worstComedyRank) && (mov.getType() == Type.COMEDY)) {
                worstComedyRank = mov.getRank();
                objComedy = mov;
            }
        }

        for (Series ser : series) {
            if ((ser.getRank() > worstComedyRank) && (ser.getType() == Type.COMEDY)) {
                worstComedyRank = ser.getRank();
                objComedy = ser;
            }   
        }

        if (objComedy instanceof Movie) {
            Movie movComedyTemp = (Movie) objComedy;
            System.out.printf("\nShow director name of COMEDY's worst ranking: " + movComedyTemp.getId());
        } else if (objComedy instanceof Series) {
            Series serComedyTemp = (Series) objComedy;
            System.out.printf("\nShow director name of COMEDY's worst ranking: " + serComedyTemp.getId());
        }
    }
}
