package CharacterCreatorAppPackage; /**
 * Created by Eric the Red on 3/4/2016.
 */

import javafx.application.Application;
import javafx.stage.Stage;

//GUI CharCreatorAppController, currently all methods return empties
public class CharCreatorAppController extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public static String getSkillInput() {
        return getSkillInput(1)[0];
    }
    public static String[] getSkillInput(int i) {
        String[] skills = {};

        return skills;
    }

    public static String[] getLangInput(int i) {
        String[] langs = {};

        return langs;
    }

    public static String getRaceInput() {
        String race = "";

        return race;
    }

    public static Object[] getRaceStats(String race) {
        Object[] stats = {};

        return stats;
    }

    public static Object[] getSpellStats(String spellName) {
        Object[] stats = {};

        return stats;
    }

    public static String getAbilInput() {
        String abil = "";

        return abil;
    }




}
