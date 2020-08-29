# Config Recompose

This is a demo which reproduces a bug with recomposition in compose
1.0.0-alpha01.

When toggling dark mode on the device this app is installed on, the theme of
the content displayed by compose should get updated, but doesn't.

This bug is no longer present in the `SNAPSHOT` builds for `1.0.0`.
