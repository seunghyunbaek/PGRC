package best.hyun.pgrc.type.doori

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Stainwoori : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_stainwoori)
    override val type: PET_TYPE
        get() = PET_TYPE.DOORI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_stainwoori)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.EARTH
    override val subElemental: ELEMENTAL?
        get() = null
    override val mainElementalValue: Int
        get() = 100
    override val subElementalValue: Int
        get() = 0
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 27
    override val initLvMaxAtk: Int
        get() = 4
    override val initLvMaxDef: Int
        get() = 4
    override val initLvMaxSpd: Int
        get() = 3
    override val maxLvMaxHp: Int
        get() = 1413
    override val maxLvMaxAtk: Int
        get() = 225
    override val maxLvMaxDef: Int
        get() = 240
    override val maxLvMaxSpd: Int
        get() = 176
    override val initLvMinHp: Int
        get() = 20
    override val initLvMinAtk: Int
        get() = 3
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 2
    override val maxLvMinHp: Int
        get() = 1167
    override val maxLvMinAtk: Int
        get() = 180
    override val maxLvMinDef: Int
        get() = 195
    override val maxLvMinSpd: Int
        get() = 139
    override val minAllGrowth: Double
        get() = 3.685
    override val maxAllGrowth: Double
        get() = 4.532
}