package libraryStuff;

import java.util.TreeMap;

public class MaterialCatalog {

	private TreeMap<String, Material>matMap; 
	//NB not given the same name as in VPP
	//also NB not initialized yet
	//that will be done in the constructor
	
	public MaterialCatalog(){
		matMap = new TreeMap<String, Material>();
		//now the map has been initialized and instantiated
	}
	
	public void addMaterial(Material newMats){
		matMap.put(newMats.getID(), newMats);
	}

	public TreeMap<String, Material> getMatMap() {
		return matMap;
	}
	
	

	
}
