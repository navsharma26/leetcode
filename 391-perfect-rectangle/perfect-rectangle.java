class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
        long areaSum = 0;

        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        Set<String> points = new HashSet<>();

        for (int[] r : rectangles) {
            int x1 = r[0], y1 = r[1], x2 = r[2], y2 = r[3];

            areaSum += (long)(x2 - x1) * (y2 - y1);

            minX = Math.min(minX, x1);
            minY = Math.min(minY, y1);
            maxX = Math.max(maxX, x2);
            maxY = Math.max(maxY, y2);

            String p1 = x1 + "," + y1;
            String p2 = x1 + "," + y2;
            String p3 = x2 + "," + y1;
            String p4 = x2 + "," + y2;

            // toggle corners
            if (!points.add(p1)) points.remove(p1);
            if (!points.add(p2)) points.remove(p2);
            if (!points.add(p3)) points.remove(p3);
            if (!points.add(p4)) points.remove(p4);
        }

        // total area must match big rectangle
        long largeArea = (long)(maxX - minX) * (maxY - minY);

        if (areaSum != largeArea) return false;

        // must have only 4 corner points
        if (points.size() != 4) return false;

        Set<String> required = new HashSet<>();
        required.add(minX + "," + minY);
        required.add(minX + "," + maxY);
        required.add(maxX + "," + minY);
        required.add(maxX + "," + maxY);

        return points.equals(required);
    }
}