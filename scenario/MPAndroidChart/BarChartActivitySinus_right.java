class BarChartActivitySinus {
    void setData() {
        if (mChart.getData() != null && mChart.getData().getDataSetCount() > 0) {
            set = (BarDataSet) mChart.getData().getDataSetByIndex(0);
            set.setYVals(entries);
            mChart.getData().setXVals(xVals);
            mChart.notifyDataSetChanged();
        } else {
            set = new BarDataSet(entries, "Sinus Function");
            set.setBarSpacePercent(40f);
            set.setColor(Color.rgb(240, 120, 124));
        }
        BarData data = new BarData(xVals, set);
        data.setValueTextSize(10f);
        data.setValueTypeface(mTf);
        data.setDrawValues(false);
        mChart.setData(data);
    }
}
