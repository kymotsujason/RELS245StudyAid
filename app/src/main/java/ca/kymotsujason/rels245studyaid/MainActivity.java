package ca.kymotsujason.rels245studyaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button submit = findViewById(R.id.button);
        final Button next = findViewById(R.id.button2);
        final TextView text = findViewById(R.id.textView);
        final ImageView image = findViewById(R.id.imageView);

        final ArrayList<String> images = new ArrayList<String>(
                Arrays.asList("alive_living", "all_each_every", "all_each_every2",
                        "and_but_now", "army_host", "beautiful_excellent", "because_that_when",
                        "behind_after", "between_among", "blessing_gift", "book",
                        "bread_food", "brother", "camel", "camp",
                        "child", "city", "commandment", "counsel_advice",
                        "daughter_younggirl", "daughters", "day", "days",
                        "death", "deliverance_salvation", "earth_land", "elder_old_oldman",
                        "enemy", "evil", "eye_well_dual", "face",
                        "father", "field_country", "fire", "from_someof",
                        "garden", "gate", "god_gods", "god_strongone",
                        "gold", "good", "great_large", "ground_earth",
                        "half", "hand", "hard_difficult", "he_it",
                        "heart", "heart2", "heaven_sky", "hedwelled_sat",
                        "hegave_put_set", "here", "hewalked_went", "hill_height",
                        "honor_glory", "horse", "houses", "house_tent",
                        "hunger_famine", "ic_launcher_background", "ic_launcher_background", "in_with_by", "intheeyesof_intheopinionof", "israel",
                        "jerusalem", "joy_gladness", "judah", "king",
                        "law_instruction", "life_lifetime", "light_daylight", "like_as_accordingto",
                        "man_humankind", "man_humankind_adam", "mare", "men",
                        "messenger_angel", "midst", "mountain_hill_country", "mouth_edge_opening",
                        "much_many", "much_verymuch_exceedingly", "name", "neww",
                        "night", "not_no", "not_no2", "now",
                        "number", "on_upon_over_against_by", "one", "peace_welfare_prosperity",
                        "people_nation", "place", "precious_costly_rare", "prophet",
                        "prophetess", "queen", "rels245", "righteous", "righteousness",
                        "river", "road_way", "sea", "servant_slave",
                        "service_work_mission", "signoftheaccusative", "signoftheaccusative2", "silver_money",
                        "small_unimportant", "son", "spirit_breath_wind", "star",
                        "straight_upright_right", "table", "temple_palace", "the",
                        "thelord_yhwh", "there", "thereis_thereare", "thereisnot_therearenot",
                        "thereisnot_therearenot2", "theywent_walked", "throne_chair", "to_for",
                        "to_toward", "toappoint_attendto_visit_muster", "tobreak_destroy", "tobringforth_bear_beget",
                        "tocapture_seize_take", "tochoose_select", "toclose_shut_shutup", "tofall_lie",
                        "tofind", "togather_collect_assemble", "togodown_descend", "tohear_listen",
                        "tojudge_govern", "tokill_slay", "toremember", "tosay",
                        "totrust", "towork_serve", "towrite", "under_insteadof",
                        "understanding_perception", "vineyard_orchard", "voice_sound", "war_battle",
                        "warrior_hero_mighty_valiant", "water_waters", "when_as", "where",
                        "who", "who_which_that", "wicked_evil_guilty", "wisdom",
                        "with", "with_near", "with_near2", "woman_wife",
                        "women", "women_wife", "word_thing_matter", "work_labor_service",
                        "year", "youth_lad_servant")
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
                        "Garden", "Gate", "God, Gods", "God, Strong one",
                        "Gold", "Good", "Great, Large", "Ground, Earth",
                        "Half", "Hand", "Hard, Difficult", "He, It",
                        "Heart", "Heart", "Heaven, Sky", "He dwelled, Sat",
                        "He gave, Put, Set", "Here", "He walked, Went", "Hill, Height",
                        "Honor, Glory", "Horse", "Houses", "House, Tent",
                        "hunger, famine", "Placeholder, ignore this", "Placeholder, ignore this", "In, With, By", "In the eyes of, In the opinion of", "Israel",
                        "jerusalem", "joy, gladness", "judah", "king",
                        "Law, Instruction", "life, lifetime", "light, daylight", "like, as, accordingto",
                        "Man, Humankind", "Man, Humankind, Adam", "Mare", "Men",
                        "Messenger, Angel", "Midst", "Mountain, Hill, Country", "Mouth, Edge, Opening",
                        "Much, Many", "Much, Very much, Exceedingly", "Name", "Neww",
                        "Night", "Not, No", "Not, No", "Now",
                        "Number", "On, Upon, Over, Against, By", "One", "Peace, Welfare, Prosperity",
                        "People, Nation", "Place", "Precious, Costly, Rare", "Prophet",
                        "Prophetess", "Queen", "Placeholder, ignore this", "Righteous", "Righteousness",
                        "River", "Road, Way", "Sea", "Servant, Slave",
                        "Service, Work, Mission", "Sign of the accusative", "With, Near, Sign of the accusative", "Silver, Money",
                        "Small, Unimportant", "Son", "Spirit, Breath, Wind", "Star",
                        "Straight, Upright, Right", "Table", "Temple, Palace", "The",
                        "The Lord, Yhwh", "There", "There is, There are", "There is not, There are not",
                        "There is not, There are not", "They went, Walked", "Throne, Chair", "To, For",
                        "To, Toward", "To appoint, Attend to, Visit, Muster", "To break, Destroy", "To bring forth, Bear, Beget",
                        "To capture, Seize, Take", "To choose, Select", "To close, Shut, Shut up", "To fall, Lie",
                        "To find", "To gather, Collect, Assemble", "To go down, Descend", "To hear, Listen",
                        "To judge, Govern", "To kill, Slay", "To remember", "To say",
                        "To trust", "To work, Serve", "To write", "Under, Instead of",
                        "Understanding, Perception", "Vineyard, Orchard", "Voice, Sound", "War, Battle",
                        "Warrior, Hero, Mighty, Valiant", "Water, Waters", "When, as", "Where",
                        "Who", "Who, Which, That", "Wicked, Evil, Guilty", "Wisdom",
                        "With", "With, Near, Sign of the accusative", "With, Near, Sign of the accusative", "Woman, Wife",
                        "Women", "Women, Wife", "Word, Thing, Matter", "Work, Labor, Service",
                        "Year", "Youth, Lad, Servant")
        );

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                next.setVisibility(v.VISIBLE);
                submit.setVisibility(v.GONE);
                text.setVisibility(v.VISIBLE);
                text.setText(imageNames.get(num));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                next.setVisibility(v.GONE);
                submit.setVisibility(v.VISIBLE);
                text.setVisibility(v.GONE);
                RandomNumber();
                int setImage = getResources().getIdentifier(images.get(num), "drawable", getPackageName());
                image.setImageResource(setImage);
            }
        });
    }

    void RandomNumber() {
        Random rand = new Random();
        int n = rand.nextInt(164);
        num = n;
    }
}
