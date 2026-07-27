class Solution {
    public String reformatDate(String date) {
        // Split the date string into Day, Month, and Year
        String[] parts = date.split(" ");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];
        
        // 1. Format the Year (already in 4 digits)
        StringBuilder sb = new StringBuilder();
        sb.append(year).append("-");
        
        // 2. Format the Month
        sb.append(getMonth(month)).append("-");
        
        // 3. Format the Day (Remove the last two letters: st, nd, rd, th)
        String d = day.substring(0, day.length() - 2);
        if (d.length() == 1) {
            sb.append("0"); // Pad with a leading zero if it's a single digit
        }
        sb.append(d);
        
        return sb.toString();
    }
    
    // Helper method to map the month abbreviation to its 2-digit number
    private String getMonth(String month) {
        switch(month) {
            case "Jan": return "01";
            case "Feb": return "02";
            case "Mar": return "03";
            case "Apr": return "04";
            case "May": return "05";
            case "Jun": return "06";
            case "Jul": return "07";
            case "Aug": return "08";
            case "Sep": return "09";
            case "Oct": return "10";
            case "Nov": return "11";
            case "Dec": return "12";
            default: return "";
        }
    }
}
