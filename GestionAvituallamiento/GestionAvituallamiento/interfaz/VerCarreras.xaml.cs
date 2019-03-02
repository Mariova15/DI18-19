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
    /// Interaction logic for VerCarreras.xaml
    /// </summary>
    public partial class VerCarreras : Window
    {

        public GestionApp gestionApp { get; set; }

        public VerCarreras(GestionApp gestionApp)
        {
            InitializeComponent();
            this.gestionApp = gestionApp;
            this.DataContext = gestionApp;
        }

        private void ButtonEditar_Click(object sender, RoutedEventArgs e)
        {

            if (DataGridCarrera.SelectedIndex != -1)
            {
                CrearCarrera crearCarrera = new CrearCarrera(gestionApp, DataGridCarrera.SelectedIndex);
                crearCarrera.Show();
            }
            else {
                MessageBox.Show("Selecciona una carrera");
            }
        }

        private void ButtonAnnadir_Click(object sender, RoutedEventArgs e)
        {
            CrearCarrera crearCarrera = new CrearCarrera(gestionApp);
            crearCarrera.Show();
        }

        private void ButtonBorrar_Click(object sender, RoutedEventArgs e)
        {           
            if (DataGridCarrera.SelectedIndex != -1)
            {
                gestionApp.borrarCarrera(DataGridCarrera.SelectedItem as Carrera);
            }
            else
            {
                MessageBox.Show("Selecciona una carrera");
            }
        }

        private void ButtonAnnadirAvituallamiento_Click(object sender, RoutedEventArgs e)
        {          
            if (DataGridCarrera.SelectedIndex != -1)
            {
                CrearAvituallamiento crearAvituallamiento = new CrearAvituallamiento(gestionApp, DataGridCarrera.SelectedItem as Carrera);
                crearAvituallamiento.Show();
            }
            else
            {
                MessageBox.Show("Selecciona una carrera");
            }
        }

        private void ButtonVerAvituallamientos_Click(object sender, RoutedEventArgs e)
        {            
            if (DataGridCarrera.SelectedIndex != -1)
            {
                VerAvituallamientoCarrera verAvituallamientoCarrera = new VerAvituallamientoCarrera(
                gestionApp, DataGridCarrera.SelectedItem as Carrera);
                verAvituallamientoCarrera.Show();
            }
            else
            {
                MessageBox.Show("Selecciona una carrera");
            }
        }

        
    }
}
