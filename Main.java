package Music;

public class Main {
    public static void main(String[] args) {

        PopMusic pop = new PopMusic();
        pop.genreMusic = "Pop";
        pop.group1 = "Backstreet Boys";
        pop.group2 = "Spice Girls";
        pop.group3 = "Aqua";

        RockMusic rock = new RockMusic();
        rock.genreMusic = "Rock";
        rock.group1 = "Nirvana";
        rock.group2 = "Ace of Base";
        rock.group3 = "Sabaton";

        ClassicMusic classic = new ClassicMusic();
        classic.genreMusic = "Classic";
        classic.group1 = "Didula";
        classic.group2 = "Vanessa Mei";
        classic.group3 = "Louis Armstrong";

        String[][] musicArray = new String[][]{
                {pop.genreMusic, pop.group1, pop.group2, pop.group3},
                {rock.genreMusic, rock.group1, rock.group2, rock.group3},
                {classic.genreMusic, classic.group1, classic.group2, classic.group3}
        };
        for (String[] music : musicArray) {
            pop.groups();
            rock.groups();
            classic.groups();
        }
    }
}
