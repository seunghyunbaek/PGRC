package best.hyun.pgrc.type.manasipu

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Pwito : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_pwito)
    override val type: PET_TYPE
        get() = PET_TYPE.MONASIPU
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_pwito)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 80
    override val subElementalValue: Int
        get() = 20
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 62
    override val initLvMaxAtk: Int
        get() = 14
    override val initLvMaxDef: Int
        get() = 8
    override val initLvMaxSpd: Int
        get() = 8
    override val maxLvMaxHp: Int
        get() = 1464
    override val maxLvMaxAtk: Int
        get() = 345
    override val maxLvMaxDef: Int
        get() = 209
    override val maxLvMaxSpd: Int
        get() = 197
    override val initLvMinHp: Int
        get() = 48
    override val initLvMinAtk: Int
        get() = 12
    override val initLvMinDef: Int
        get() = 6
    override val initLvMinSpd: Int
        get() = 6
    override val maxLvMinHp: Int
        get() = 1253
    override val maxLvMinAtk: Int
        get() = 306
    override val maxLvMinDef: Int
        get() = 170
    override val maxLvMinSpd: Int
        get() = 165
    override val minAllGrowth: Double
        get() = 4.480
    override val maxAllGrowth: Double
        get() = 5.187
}