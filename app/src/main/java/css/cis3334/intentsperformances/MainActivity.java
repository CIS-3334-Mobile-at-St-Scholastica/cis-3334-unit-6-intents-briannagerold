package css.cis3334.intentsperformances;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1Web, but1Calendar, btn1Map, btn2Web, but2Calendar, btn2Map, btn3Web, but3Calendar, btn3Map;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus1);
        setupButtonClickEvents();



    }


    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo1);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d129826104%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(webIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar1);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Twin Ports Choral Project - All Things New");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2019, 1, 22, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2019, 1, 22, 21, 30);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(calIntent);
                }

            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map1);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+Minnesota");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(mapIntent);
                }
            }
        });


        btn2Web = (Button) findViewById(R.id.button1WebInfo2);
        btn2Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d129827065%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(webIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but2Calendar = (Button) findViewById(R.id.button1Calendar2);
        but2Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Zenith City Sings Choir Festival");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2019, 2, 21, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2019, 2, 21, 21, 30);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(calIntent);
                }

            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn2Map = (Button) findViewById(R.id.button1map2);
        btn2Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+Minnesota");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(mapIntent);
                }
            }
        });

        btn3Web = (Button) findViewById(R.id.button1WebInfo3);
        btn3Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d129880558%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(webIntent);
                }
            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but3Calendar = (Button) findViewById(R.id.button1Calendar3);
        but3Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "The Fan");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2019, 3, 11, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2019, 3, 11, 21, 30);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(calIntent);
                }

            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn3Map = (Button) findViewById(R.id.button1map3);
        btn3Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                Uri location = Uri.parse("geo:0,0?q=1200+Kenwood+Ave,+Duluth,+Minnesota");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                boolean isIntentSafe = activities.size() > 0;

                if (isIntentSafe) {
                    startActivity(mapIntent);
                }
            }
        });


    }


}
