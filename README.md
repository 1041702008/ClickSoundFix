# ClickSoundFix
This Mod Fixes an annoying Bug which would play the UI-Click Sound twice when opening a new UI and the Mouse-Cursor is over a Slider in this new UI (For example the Sound Settings UI).

**How it works**

**v1.1-Edit**
Now it's done by just setting a boolean to true when the click-action passed, and to false when it releases. Also on release, the sound only gets played if the boolean is true, aka if the slider was really pressed before, and not only released.

**Feel free to include this in other projects, but in that case it'd be nice to credit me :)**
