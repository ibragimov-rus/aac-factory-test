//load the mould to the storage
currentMould = mould;
isEmpty = false;
precureFinished.restart();
loadTime = time();
currentMould.cake.state = IN_STORAGE;
main.DBWrite(currentMould.cake);
group.setVisible(true);
arc.setFillColor(new Color(237, 223, 82));