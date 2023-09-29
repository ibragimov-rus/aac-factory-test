if (cuttingLine2.inState(CuttingLine.Service))
	if (cuttingLine2.transition6.getRest() > crossCuttingTime*minute()/2)
		return -(crossCuttingTime*minute() - cuttingLine2.transition6.getRest())/(crossCuttingTime*minute()/2)*16;
	else return -cuttingLine2.transition6.getRest()/(crossCuttingTime*minute()/2)*16;
else return 0;