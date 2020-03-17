package best.hyun.pgrc.type

import best.hyun.pgrc.type.yangiro.Libino
import best.hyun.pgrc.type.yangiro.Yangiro


interface PetAbstractFactory { fun createPet():Pet }
class YangiroFactory: PetAbstractFactory { override fun createPet(): Pet = Yangiro() }
class LibinoFactory: PetAbstractFactory { override fun createPet(): Pet = Libino() }

class PetFactory {
    companion object {
        fun getPet(petAbstractFactory: PetAbstractFactory) = petAbstractFactory.createPet()
    }
}


