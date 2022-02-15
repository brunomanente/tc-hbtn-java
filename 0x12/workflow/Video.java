
public class Video {
		private String arquivo;
		private FormatoVideo formado;
		
		public Video() {
			
		}

		public Video(String arquivo, FormatoVideo formado) {
			super();
			this.arquivo = arquivo;
			this.formado = formado;
		}

		public String getArquivo() {
			return arquivo;
		}

		public void setArquivo(String arquivo) {
			this.arquivo = arquivo;
		}

		public FormatoVideo getFormado() {
			return formado;
		}

		public void setFormado(FormatoVideo formado) {
			this.formado = formado;
		}
		
		
}
