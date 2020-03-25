package best.hyun.pgrc

import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.beast.*
import best.hyun.pgrc.type.fourguardiangods.BlackTortoise
import best.hyun.pgrc.type.fourguardiangods.BlueDragon
import best.hyun.pgrc.type.fourguardiangods.RedBird
import best.hyun.pgrc.type.fourguardiangods.WhiteTiger
import best.hyun.pgrc.type.ogaros.*
import best.hyun.pgrc.type.special.*
import best.hyun.pgrc.type.werewolf.EarthWereWolf
import best.hyun.pgrc.type.werewolf.FireWereWolf
import best.hyun.pgrc.type.werewolf.WaterWereWolf
import best.hyun.pgrc.type.werewolf.WindWereWolf
import best.hyun.pgrc.type.yangiro.*

interface PetAbstractFactory { fun createPet(): Pet }
class BanboroFactory:
    PetAbstractFactory { override fun createPet(): Pet = Banboro() }
class BanginoFactory:
    PetAbstractFactory { override fun createPet(): Pet = Bangino() }
class BurudonFactory:
    PetAbstractFactory { override fun createPet(): Pet = Burudon() }
class GibinoFactory:
    PetAbstractFactory { override fun createPet(): Pet = Gibino() }
class LibinoFactory:
    PetAbstractFactory { override fun createPet(): Pet = Libino() }
class YangiroFactory:
    PetAbstractFactory { override fun createPet(): Pet = Yangiro() }

class PetFactory {
    companion object {
        // 특정 페트 얻기
        fun getPet(petAbstractFactory: PetAbstractFactory) = petAbstractFactory.createPet()

        // 모든 페트 종류 얻기 ( ~~~류 )
        fun getPetTypes(): Array<PET_TYPE> = PET_TYPE.values()

        /* 페트 리스트 [Start] */
        private fun getSpecialPets(): Array<Pet> = arrayOf(Laiby(), Bokwoori(), Fywable(), Peruru(), Dorudoru(), YongIceDragon(), Kawoo(), Hubaty())
        private fun getFourguardiansgodPets(): Array<Pet> = arrayOf(WhiteTiger(), RedBird(), BlackTortoise(), BlueDragon())
        private fun getWereWolfPets():Array<Pet> = arrayOf(EarthWereWolf(), WaterWereWolf(), FireWereWolf(), WindWereWolf())
        private fun getBeastPets(): Array<Pet> = arrayOf(EarthHorse(), WaterHorse(), FireHorse(), WindHorse(), MecaEarthHorse(), MecaWaterHorse(), MecaFireHorse(), MecaWindHorse(), EarthMouse(), WaterMouse(), FireMouse(), WindMouse())
        private fun getYangiroPets(): Array<Pet> = arrayOf(Libino(), Yangiro(), Banboro(), Bangino(), Burudon(), Gibino(), Bino(), Giro(), Boro(), Gino(), Rudon(), Ssagat(), Teinos())
        private fun getOgarosPets(): Array<Pet> = arrayOf(Ogaros(), Orgon(), Mogaros(), Golos(), Norgon(), Pooryong(), Jigaros(), Kalos())
        /* 페트 리스트 [End] */

        // 특정 타입 페트 얻기 ( ~류 페트 얻기: 얀기로, 반보로 )
        fun getTypePets(type: PET_TYPE): Array<Pet> = when(type) {
            PET_TYPE.SPECIAL -> getSpecialPets()
            PET_TYPE.FOURGUARDIANSOGDS -> getFourguardiansgodPets()
            PET_TYPE.WEREWOLF -> getWereWolfPets()
            PET_TYPE.BEAST -> getBeastPets()
            PET_TYPE.YANGIRO -> getYangiroPets()
            PET_TYPE.OGAROS -> getOgarosPets()
            else -> { getYangiroPets() }
        }

        // 특정 타입 페트류 이름 얻기 ( ~류 하위 페트 이름 얻기: 반보로, 얀기로 ... )
        fun getTypePetNames(type: PET_TYPE): Array<CharSequence> {
            var typePets:Array<Pet> = arrayOf()

            when(type) {
                PET_TYPE.SPECIAL -> typePets =
                    getSpecialPets()
                PET_TYPE.FOURGUARDIANSOGDS -> typePets =
                    getFourguardiansgodPets()
                PET_TYPE.WEREWOLF -> typePets =
                    getWereWolfPets()
                PET_TYPE.BEAST -> typePets =
                    getBeastPets()
                PET_TYPE.YANGIRO -> typePets =
                    getYangiroPets()
                PET_TYPE.OGAROS -> typePets =
                    getOgarosPets()
            }

            val typePetNames: ArrayList<CharSequence> = ArrayList()
            typePets.forEach { typePetNames.add(it.name) }
            return typePetNames.toTypedArray()
        }

//        fun getTypePetNames2(typePets:Array<Pet>): Array<CharSequence> {
//            var typePetNames:ArrayList<CharSequence> = ArrayList()
//            typePets.forEach { typePetNames.add(it.name)  }
//            return typePetNames.toTypedArray()
//        }

    }
}


