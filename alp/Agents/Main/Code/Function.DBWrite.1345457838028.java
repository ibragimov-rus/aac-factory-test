//store the last 30 processing step
int maxlines = 47;
processingLog.add(0,"day " + (int)(time()/day() + 1) + ": " + dateFormat.format(date()) + " - #" + cake.id + " " + stateToText.get(cake.state));

if (processingLog.size() > maxlines) processingLog.remove(maxlines);

textProcessing = "";
for (String s : processingLog)
		textProcessing += s + "\n";
if (processingLog.size() == maxlines) textProcessing += "...";