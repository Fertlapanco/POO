package  {
	import flash.display.MovieClip;
	//firma o contrato
	public class setup extends MovieClip {	
		private var Fondo_new:Fondo =new Fondo();
		private var piso_new:piso=new piso();
		private var antagonista_new:antagonista=new antagonista();
		private var protagonista_new:protagonista =new protagonista();
		public function setup() {
			addChild( Fondo_new);
			Fondo_new.y=178;
			Fondo_new.x=275;
			
			addChild( piso_new);
			piso_new.y=380;
			piso_new.x=285;
			
			addChild( antagonista_new);
			antagonista_new.y=90;
			antagonista_new.x=170;
			
			addChild( protagonista_new);
			protagonista_new.y=380;
			protagonista_new.x=300;
		}
	}
	
}