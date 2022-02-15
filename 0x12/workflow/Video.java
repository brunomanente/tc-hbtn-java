
public class Video {
		private String arquivo;
		private FormatoVideo formato;
		
		public Video() {
			
		}

		public Video(String arquivo, FormatoVideo formato) {
			super();
			this.arquivo = arquivo;
			this.formato = formato;
		}

		public String getArquivo() {
			return arquivo;
		}

		public void setArquivo(String arquivo) {
			this.arquivo = arquivo;
		}

		public FormatoVideo getFormado() {
			return formato;
		}

		public void setFormado(FormatoVideo formado) {
			this.formato = formado;
		}
		
		
}
