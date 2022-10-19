

    public class UsageAnalytics {
        private int visitsCount;
        public UsageAnalytics() {
            visitsCount = 0;
        }
        public int countVisit() {
            return ++visitsCount;
        }
    }
