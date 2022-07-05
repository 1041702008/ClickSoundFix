# ClickSoundFix

**NOTE:** Some people asked me if my mods work on Quilt, or if i will port them over if not.

The answer is easy: NO.

Why? Quilt is something i don't want to support myself. It's one of those "It exists just to exist" projects, where i don't see any reason for it to exist.
In terms of development, there's no big changes from fabric, and all changes that exist don't make any sense in my opinion, and/or could easily be included in fabric. but no, they had to "reinvent the wheel".

So in short: if my mods work on quilt, cool. you can obviously use them.
If they don't, you're on your own.


-------------------------------------------------------



This Mod Fixes an annoying Bug which would play the UI-Click Sound twice when opening a new UI and the Mouse-Cursor is over a Slider in this new UI (For example the Sound Settings UI).

**How it works**

**v1.1-Edit**
Now it's done by just setting a boolean to true when the click-action passed, and to false when it releases. Also on release, the sound only gets played if the boolean is true, aka if the slider was really pressed before, and not only released.

**Feel free to include this in other projects, but in that case it'd be nice to credit me :)**
