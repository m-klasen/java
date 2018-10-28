
public class Sheep {
	
		public String name;
		public Fur fur;
		
		public Sheep(String name, Fur fur) {
			this.name = name;
			this.fur = fur;
		}
		
		public void shear() {
			fur.length = 0;
		}
		public String toString() {
			return "Name: " + name + " " + fur.toString();
		}
		
		public Object shallowclone() {
			Sheep s = new Sheep(name, fur);
			return s;
		}
		
		public Object deepclone() {
			Sheep s = new Sheep(name,new Fur(fur.length));
			return s;
		}
		
		public boolean equals (Object obj){
			
			Sheep b = (Sheep)obj;
			if (obj == null){
				return false;
			}
			if (!(obj instanceof Sheep)){
				return false;
			}
			if  (this.name == b.name && this.fur.equals(fur)){
				return true;
			}
			return false;
		}
}
