package textures;

public class ModelTexture {
	
	private int textureID;
	private float shindeDamper = 1;
	private float reflectivity = 0;
	
	public float getShindeDamper() {
		return shindeDamper;
	}

	public void setShindeDamper(float shindeDamper) {
		this.shindeDamper = shindeDamper;
	}

	public float getReflectivity() {
		return reflectivity;
	}

	public void setReflectivity(float reflectivity) {
		this.reflectivity = reflectivity;
	}

	public ModelTexture(int texture){
		this.textureID = texture;
	}
	
	public int getID(){
		return textureID;
	}

}