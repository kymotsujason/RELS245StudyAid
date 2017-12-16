package ca.kymotsujason.rels245studyaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Integer num = 0;
    Integer numCount = 1;
    Integer[] originalList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
    31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,
    65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,
    99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,
    125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,
    151,152,153,154,155,156,157,158,159,160,161,162};
    Integer[] wordPos = originalList;
    List<Integer> shuffle = new ArrayList<>();
    Boolean cleared = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button submit = findViewById(R.id.button);
        final Button next = findViewById(R.id.button2);
        final Button start = findViewById(R.id.button3);
        final Button reset = findViewById(R.id.button4);
        final TextView text = findViewById(R.id.textView);
        final TextView textCount = findViewById(R.id.textView2);
        final ImageView image = findViewById(R.id.imageView);

        final ArrayList<String> images = new ArrayList<String>(
                Arrays.asList("_alive_living", "_all_each_every", "_all_each_every2",
                        "_and_but_now", "_army_host", "_beautiful_excellent", "_because_that_when",
                        "_behind_after", "_between_among", "_blessing_gift", "_book",
                        "_bread_food", "_brother", "_camel", "_camp",
                        "_child", "_city", "_commandment", "_counsel_advice",
                        "_daughter_younggirl", "_daughters", "_day", "_days",
                        "_death", "_deliverance_salvation", "_earth_land", "_elder_old_oldman",
                        "_enemy", "_evil", "_eye_well_dual", "_face",
                        "_father", "_field_country", "_fire", "_from_someof",
                        "_garden", "_gate", "_god_gods", "_god_strongone",
                        "_gold", "_good", "_great_large", "_ground_earth",
                        "_half", "_hand", "_hard_difficult", "_he_it",
                        "_heart", "_heart2", "_heaven_sky", "_hedwelled_sat",
                        "_hegave_put_set", "_here", "_hewalked_went", "_hill_height",
                        "_honor_glory", "_horse", "_houses", "_house_tent",
                        "_hunger_famine", "_in_with_by", "_intheeyesof_intheopinionof", "_israel",
                        "_jerusalem", "_joy_gladness", "_judah", "_king",
                        "_law_instruction", "_life_lifetime", "_light_daylight", "_like_as_accordingto",
                        "_man_humankind", "_man_humankind_adam", "_mare", "_men",
                        "_messenger_angel", "_midst", "_mountain_hill_country", "_mouth_edge_opening",
                        "_much_many", "_much_verymuch_exceedingly", "_name", "_new",
                        "_night", "_not_no", "_not_no2", "_now",
                        "_number", "_on_upon_over_against_by", "_one", "_peace_welfare_prosperity",
                        "_people_nation", "_place", "_precious_costly_rare", "_prophet",
                        "_prophetess", "_queen", "_righteous", "_righteousness",
                        "_river", "_road_way", "_sea", "_servant_slave",
                        "_service_work_mission", "_silver_money", "_small_unimportant", "_son",
                        "_spirit_breath_wind", "_star", "_straight_upright_right", "_table",
                        "_temple_palace", "_the", "_thelord_yhwh", "_there",
                        "_thereis_thereare", "_thereisnot_therearenot", "_thereisnot_therearenot", "_theywent_walked",
                        "_throne_chair", "_to_for", "_to_toward", "_toappoint_attendto_visit_muster",
                        "_tobreak_destroy", "_tobringforth_bear_beget", "_tocapture_seize_take", "_tochoose_select",
                        "_toclose_shut_shutup", "_tofall_lie", "_tofind", "_togather_collect_assemble",
                        "_togodown_descend", "_tohear_listen", "_tojudge_govern", "_tokill_slay",
                        "_toremember", "_tosay", "_totrust", "_towork_serve",
                        "_towrite", "_under_insteadof", "_understanding_perception", "_vineyard_orchard",
                        "_voice_sound", "_war_battle", "_warrior_hero_mighty_valiant", "_water_waters",
                        "_when_as", "_where", "_who", "_who_which_that",
                        "_wicked_evil_guilty", "_wisdom", "_with", "_with_near",
                        "_with_near2", "_woman_wife", "_women", "_women_wife",
                        "_word_thing_matter", "_work_labor_service", "_year", "_youth_lad_servant")
        );

        final ArrayList<String> imageNames = new ArrayList<String>(
                Arrays.asList("Alive, Living", "All, Each, Every", "All, Each, Every",
                        "And, But, Now", "Army, Host", "Beautiful, Excellent", "Because, That, When",
                        "Behind, After", "Between, Among", "Blessing, Gift", "Book",
                        "Bread, Food", "Brother", "Camel", "Camp",
                        "Child", "City", "Commandment", "Counsel, Advice",
                        "Daughter, Young girl", "Daughters", "Day", "Days",
                        "Death", "Deliverance, Salvation", "Earth, Land", "Elder, Old, Old man",
                        "Enemy", "Evil", "Eye, Well, Dual", "Face",
                        "Father", "Field, Country", "Fire", "From, Some of",
                        "Garden", "Gate", "God, Gods", "God, Strong _one",
                        "Gold", "Good", "Great, Large", "Ground, Earth",
                        "Half", "Hand", "Hard, Difficult", "He, It",
                        "Heart", "Heart", "Heaven, Sky", "He dwelled, Sat",
                        "He gave, Put, Set", "Here", "He walked, Went", "Hill, Height",
                        "Honor, Glory", "Horse", "Houses", "House, Tent",
                        "Hunger, Famine", "In, With, By", "In the eyes of, In the opinion of", "Israel",
                        "Jerusalem", "Joy, Gladness", "Judah", "King",
                        "Law, Instruction", "Life, Lifetime", "Light, Daylight", "Like, As, According to",
                        "Man, Humankind", "Man, Humankind, Adam", "Mare", "Men",
                        "Messenger, Angel", "Midst", "Mountain, Hill, Country", "Mouth, Edge, Opening",
                        "Much, Many", "Much, Very much, Exceedingly", "Name", "New",
                        "Night", "Not, No", "Not, No", "Now",
                        "Number", "On, Upon, Over, Against, By", "One", "Peace, Welfare, Prosperity",
                        "People, Nation", "Place", "Precious, Costly, Rare", "Prophet",
                        "Prophetess", "Queen", "Righteous", "Righteousness",
                        "River", "Road, Way", "Sea", "Servant, Slave",
                        "Service, Work, Mission", "Silver, Money", "Small, Unimportant", "Son",
                        "Spirit, Breath, Wind", "Star", "Straight, Upright, Right", "Table",
                        "Temple, Palace", "The", "The Lord, Yhwh", "There",
                        "There is, There are", "There is not, There are not", "There is not, There are not", "They went, Walked",
                        "Throne, Chair", "To, For", "To, Toward", "To appoint, Attend to, Visit, Muster",
                        "To break, Destroy", "To bring forth, Bear, Beget", "To capture, Seize, Take", "To choose, Select",
                        "To close, Shut, Shut up", "To fall, Lie", "To find", "To gather, Collect, Assemble",
                        "To go down, Descend", "To hear, Listen", "To judge, Govern", "To kill, Slay",
                        "To remember", "To say", "To trust", "To work, Serve",
                        "To write", "Under, Instead of", "Understanding, Perception", "Vineyard, Orchard",
                        "Voice, Sound", "War, Battle", "Warrior, Hero, Mighty, Valiant", "Water, Waters",
                        "When, as", "Where", "Who", "Who, Which, That",
                        "Wicked, Evil, Guilty", "Wisdom", "With", "With, Near, Sign of the accusative",
                        "With, Near, Sign of the accusative", "Woman, Wife", "Women", "Women, Wife",
                        "Word, Thing, Matter", "Work, Labor, Service", "Year", "Youth, Lad, Servant"
                )
        );

        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                start.setVisibility(v.GONE);
                while (Resetting()) {}
                RandomNumber();
                int setImage = getResources().getIdentifier(images.get(num), "drawable", getPackageName());
                image.setImageResource(setImage);
                submit.setVisibility(v.VISIBLE);
                textCount.setText(numCount + "/163 words");
                textCount.setVisibility(v.VISIBLE);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                image.setImageResource(R.drawable.rels245);
                reset.setVisibility(v.GONE);
                text.setVisibility(v.GONE);
                textCount.setVisibility(v.GONE);
                start.setVisibility(v.VISIBLE);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                submit.setVisibility(v.GONE);
                text.setText(imageNames.get(num));
                if (!cleared) {
                    next.setVisibility(v.VISIBLE);
                    text.setVisibility(v.VISIBLE);
                } else {
                    text.setVisibility(v.VISIBLE);
                    reset.setVisibility(v.VISIBLE);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                next.setVisibility(v.GONE);
                text.setVisibility(v.GONE);
                submit.setVisibility(v.VISIBLE);
                RandomNumber();
                int setImage = getResources().getIdentifier(images.get(num), "drawable", getPackageName());
                image.setImageResource(setImage);
                numCount++;
                textCount.setText(numCount + "/163 words");
            }
        });
    }

    void RandomNumber() {
        if (!shuffle.isEmpty()) {
            num = shuffle.remove(0) - 1;
        } else {
            cleared = true;
        }
    }

    Boolean Resetting() {
        num = 0;
        numCount = 1;
        wordPos = originalList;
        shuffle = new ArrayList<>();
        cleared = false;
        for (Integer i : wordPos) {
            shuffle.addAll(Collections.nCopies(1, i));
        }
        Collections.shuffle(shuffle);
        return false;
    }
}
