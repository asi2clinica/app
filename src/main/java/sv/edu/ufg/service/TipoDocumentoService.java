
package sv.edu.ufg.service;

import sv.edu.ufg.model.TipoDocumento;
import java.util.List;
/**
 *
 * @author Daniel
 */
public interface TipoDocumentoService {
    public void create(TipoDocumento r);
    public void update(TipoDocumento r);
    public void delete(TipoDocumento r);
    public TipoDocumento find(int id);
    public List<TipoDocumento> findAll();
    
}
