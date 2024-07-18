package ConditionsAndIfStatementsAndSwitch;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "fly";
        } else {
            season = "fictitious months";
        }
        System.out.println(season);
    }
}

class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println(i + " equally 0");
                    break;
                case 1:
                    System.out.println(i + " equally 1");
                    break;
                case 2:
                    System.out.println(i + " equally 2");
                    break;
                case 3:
                    System.out.println(i + " equally 3");
                    break;
                default:
                    System.out.println(i + " more than three");
            }
        }
    }
}

class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println(i + " small 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(i + " small 10");
                    break;
                default:
                    System.out.println(i + " is equal to or greater than 10");
            }
        }
    }
}

class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "fore":
                System.out.println("fore");
                break;
            default:
                System.out.println("didn't match");
        }
    }
}
