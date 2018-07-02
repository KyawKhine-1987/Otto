package com.freelance.android.ottolibrarytutorial;

public class Events {

    public static class FragmentActivityMessage {

        private String mF2Amessage;

        public FragmentActivityMessage(String message) {
            this.mF2Amessage = message;
        }

        public String getMessage() {
            return mF2Amessage;
        }
    }

    public static class ActivityFragmentMessage {

        private String mA2Fmessage;

        public ActivityFragmentMessage(String message) {
            this.mA2Fmessage = message;
        }

        public String getMessage() {
            return mA2Fmessage;
        }
    }
}
