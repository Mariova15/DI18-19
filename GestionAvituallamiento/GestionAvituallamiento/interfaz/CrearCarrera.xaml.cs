using GestionAvituallamiento.logica;
using GestionAvituallamiento.modelo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace GestionAvituallamiento.interfaz
{
    /// <summary>
    /// Interaction logic for CrearCarrera.xaml
    /// </summary>
    public partial class CrearCarrera : Window
    {

        public GestionApp gestionApp { get; set; }
        public Carrera carrera { get; set; }
        private int numErrores = 0;
        private int indexModificar = -1;

        public CrearCarrera(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.carrera = new Carrera();
            this.DataContext = this;
        }

        public CrearCarrera(GestionApp gestionApp, int indexModificar)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.indexModificar = indexModificar;
            this.carrera = gestionApp.listaCarreras[indexModificar].Clone() as Carrera;
            ButtonCrearCarrera.Content = "Modificar";
            this.DataContext = this;
        }

        private void ButtonCrearCarrera_Click(object sender, RoutedEventArgs e)
        {
            if (indexModificar != -1)
            {
                gestionApp.listaCarreras[indexModificar] = carrera;
                MessageBox.Show("Carrera modificada");
            }
            else
            {
                gestionApp.annadirCarrera(carrera);
                MessageBox.Show("Carrera creada");
            }
            this.Close();
        }

        private void Validation_Error(object sender, ValidationErrorEventArgs e)
        {
            if (e.Action == ValidationErrorEventAction.Added)
            {
                numErrores++;
                ((Control)sender).ToolTip = e.Error.ErrorContent;
            }
            else if (e.Action == ValidationErrorEventAction.Removed)
            {
                numErrores--;
                ((Control)sender).ToolTip = null;
            }
            if (numErrores == 0)
                ButtonCrearCarrera.IsEnabled = true;
            else
                ButtonCrearCarrera.IsEnabled = false;
        }

    }
}
