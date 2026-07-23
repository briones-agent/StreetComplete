/*
 * Expo brownfield demo: hosts the Expo React Native screen via expo-brownfield's
 * BrownfieldActivity. The React Native runtime and JS bundle ship inside the
 * dev.expo.brownfield:expobrownfield-fused-release AAR.
 */
package de.westnordost.streetcomplete.expo

import android.os.Bundle
import dev.expo.brownfield.BrownfieldActivity

class ExpoActivity : BrownfieldActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showReactNativeFragment()
    }
}
