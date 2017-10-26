# TagOn Android
![NSDK logo](http://tagon.co/images/tagON_logo_black.png)

**TagOn Android SDK** is an all-in-one package, advertisement management SDK that includes programmatic buying solutions and data integration. The product **TagOn Android SDK** provides amazing opportunities to the publishers and some of them are targeting, interaction, various ad models and programmatic technologies in order to increase revenue.

* **Getting Started**
* **TagOn SDK Implementation**
* **Integrating Ads**
	1. **FullPage Integration**

	
## <a name="getting_started"></a> Getting Started

* First declare this line to your projects `build.gradle` file

```
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

* Add our library to `dependencies` under your projects `build.gradle` file

```
dependencies {
	...
	compile 'com.github.NMOBS:tagonandroid:1.0.2'
	...
}
```

## <a name="implementation"></a> TagOn SDK Implementation

* Declare activities to your `AndroidManifest` file

```
<activity 
android:name="com.nmobs.tagonandroid.activities.TagOnFullPageActivity"
android:configChanges="keyboardHidden|orientation|screenSize"/>
```

* Create an Application class. In your Application's `onCreate` method, declare this line

```
TagOn.with(this);
```

## <a name="fullpage_integration"></a> FullPage Integration

* In your Activity, declare variable for your fullpage ad

`TagOnFullPage tagOnFullPage;`

* In your Activity, implement FullPageListener for your fullpage ad

```
public class MainActivity extends AppCompatActivity implements FullPageListener
```

FullPageListener requires following lines. Do not forget to add `tagOnFullPage.show();` line inside `onFullPageLoaded` event

```
    @Override
    public void onFullPageLoaded(TagOnFullPage tagOnFullPage) {
        Log.d("TagOn", "Loaded");
        tagOnFullPage.show();
    }

    @Override
    public void onFullPageFailed(TagOnFullPage tagOnFullPage, String s) {
        Log.d("TagOn", s);
    }

    @Override
    public void onFullPageShown(TagOnFullPage tagOnFullPage) {
        Log.d("TagOn", "Shown");
    }

    @Override
    public void onFullPageClicked(TagOnFullPage tagOnFullPage) {
        Log.d("TagOn", "Clicked");
    }

    @Override
    public void onFullPageDismissed(TagOnFullPage tagOnFullPage) {
        Log.d("TagOn", "Dismissed");
    }
```

* In your Activity's `onCreate` method, set your fullpage's values

```
tagOnFullPage = new TagOnFullPage.Builder()
                .publisherId("57fb51268a672")
                .inventoryId("5964d99eb71af")
                .adunitId("5991a1e4b343c")
                .availableFormats("")
                .referrer("")
                .fullPageListener(this)
                .build();
```

* In your Activity's `onResume` method, add ` tagOnFullPage.resume();` line

```
@Override
protected void onResume() {
	super.onResume();
	tagOnFullPage.resume();
}
```
