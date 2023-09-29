for (Bogey b : bogeys)   
	if (!b.isHot && b.blocks < 3)   
		return b;
return null;