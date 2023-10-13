package lesson3;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        // Nugno napisat progu, kotoraia budet rabobat 5 let bez ostanovki, no kogda
        // mi ee ostanovim ona napihet scolko vremeni prohlo ot starta;

        for(int year = 0; year < 5; year ++){
            for(int day = 0; day < 365; day ++){
                for(int hour = 0; hour < 24; hour ++){
                    for(int min = 0; min < 60; min ++){
                        for(int sec = 0; sec < 60; sec ++){
                            System.out.printf("Со старта прошло: %d года, %d дней, %d часа, %d минут, %d секунды \n", year, day, hour, min, sec);
                            Thread.sleep(1000);
                        }

                    }

                }

            }
        }

    }
}
